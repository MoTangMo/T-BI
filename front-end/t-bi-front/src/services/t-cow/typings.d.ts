declare namespace API {
  type Chart = {
    id?: number;
    goal?: string;
    name?: string;
    chartData?: string;
    chartType?: string;
    genChart?: string;
    genResult?: string;
    status?: string;
    execMessage?: string;
    userId?: number;
    createTime?: string;
    updateTime?: string;
    isDelete?: number;
  };

  type ChartCondition = {
    goal?: string;
    name?: string;
    chartType?: string;
    status?: string;
    userId?: number;
  };

  type getChartListParams = {
    condition: ChartCondition;
  };

  type R = {
    code?: number;
    message?: string;
    data?: Record<string, any>;
  };

  type SecurityConfiguration = {
    apiKey?: string;
    apiKeyVehicle?: string;
    apiKeyName?: string;
    clientId?: string;
    clientSecret?: string;
    realm?: string;
    appName?: string;
    scopeSeparator?: string;
    additionalQueryStringParams?: Record<string, any>;
    useBasicAuthenticationWithAccessCodeGrant?: boolean;
    enableCsrfSupport?: boolean;
  };

  type SwaggerResource = {
    name?: string;
    url?: string;
    swaggerVersion?: string;
    location?: string;
  };

  type UiConfiguration = {
    deepLinking?: boolean;
    displayOperationId?: boolean;
    defaultModelsExpandDepth?: number;
    defaultModelExpandDepth?: number;
    defaultModelRendering?: 'example' | 'model';
    displayRequestDuration?: boolean;
    docExpansion?: 'none' | 'list' | 'full';
    filter?: Record<string, any>;
    maxDisplayedTags?: number;
    operationsSorter?: 'alpha' | 'method';
    showExtensions?: boolean;
    showCommonExtensions?: boolean;
    tagsSorter?: 'alpha';
    validatorUrl?: string;
    apisSorter?: string;
    jsonEditor?: boolean;
    showRequestHeaders?: boolean;
    supportedSubmitMethods?: string[];
  };
}
