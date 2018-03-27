package io.github.agroportal.ncboproxy.parameters;


import io.github.agroportal.ncboproxy.ServletHandler;

import java.util.List;
import java.util.Map;

public interface ParameterHandlerRegistry {
    /**
     * Register a parameter handler for a given parameter name, that may be optional or mandatory
     * @param name The name of the parameter (i.e. name as in ?name=value)
     * @param parameterHandler The parameter handler to register
     * @param isOptional Whether the parameter is mandatory or not. A mandatory parameter must be matched, if it is absent
     *                   an exception is thrown during parameter processing. A Servlet handler will mark parameters that are re
     *                   quired to trigger that handler as mandatory
     * @return Returns self (functional style interface)
     */
    ParameterHandlerRegistry registerParameterHandler(String name, ParameterHandler parameterHandler, boolean isOptional);

    /**
     * Register a parameter handler for a given parameter name, that may be optional or mandatory
     * @param name The name of the parameter (i.e. name as in ?name=value)
     * @param parameterHandler The parameter handler to register
     * @param isOptional Whether the parameter is mandatory or not. A mandatory parameter must be matched, if it is absent
     *                   an exception is thrown during parameter processing. A Servlet handler will mark parameters that are re
     *                   quired to trigger that handler as mandatory
     * @return Returns self (functional style interface)
     */
    ParameterHandlerRegistry registerParameterHandler(String name, ParameterHandler parameterHandler, boolean isOptional, final String... constrainedValues);

    /**
     * Process parameters and trigger matching parameter handlers
     * @param queryParameters The map of query parameters
     * @param queryHeaders The map of query headers
     * @param queryPath The query path
     * @param servletHandler The servlet handler processing the request
     * @return A map of output parameters that can optionally be generated by some parameter handler to communicate values
     * to the servlet handler and to the output generator
     * @throws InvalidParameterException Thrown if an invalid value for a parameter is specified as specified in any of the
     * parameter handlers, it's the responsibility of the handlers to generate informative error messages
     */
    Map<String,String> processParameters(final Map<String,List<String>> queryParameters,
                                               final Map<String,String> queryHeaders,
                                               final String queryPath,
                                               final ServletHandler servletHandler) throws InvalidParameterException;

    /**
     * Override existing parameter handlers registered in otherParameterHandlerRegistry
     * @param otherParameterHandlerRegistry Another parameter handler registry
     * @return Returns self (functional style interface)
     */
    ParameterHandlerRegistry polymorphicOverride(ParameterHandlerRegistry otherParameterHandlerRegistry);

    /**
     * Creates an instance of the default ParameterHandlerRegistry implementation, currently {@link NCBOProxyParameterHandlerRegistry}
     * @return an instance of the default ParameterHandlerRegistry implementation
     */
    static ParameterHandlerRegistry create(){
        return new NCBOProxyParameterHandlerRegistry();
    }

    /**
     * Determines if all mandatory parameter handlers are present in the query parameters
     * @return true if all mandatory parameters are present, false otherwise
     */
    boolean areMandatoryConstraintsSatisfied(final Map<String,List<String>> queryParameters);
}
