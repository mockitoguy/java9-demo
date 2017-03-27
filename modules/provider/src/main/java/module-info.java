module com.linkedin.java9demo.provider {
    requires com.linkedin.java9demo.service;
    provides com.linkedin.java9demo.service.ServiceApi
            with com.linkedin.java9demo.provider.DefaultService;
}