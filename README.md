# Getting started

This Api is meant for 3rd party integrations

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

## How to Use

The following section explains how to use the CynSMSAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *CynSMSAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

Clicking the ``` Add ``` button will open a dialog where you need to specify CynSMSAPI in ``` Group Id ``` and CynSMSAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=CynSMS%20API-Java&workspaceName=CynSMSAPI&projectName=CynSMSAPILib&rootNamespace=com.cynojine.sms)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *CynSMSAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

CynSMSAPIClient client = new CynSMSAPIClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIController](#api_controller)

## <a name="api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.cynojine.sms.controllers.APIController") APIController

### Get singleton instance

The singleton instance of the ``` APIController ``` class can be accessed from the API Client.

```java
APIController client = client.getClient();
```

### <a name="create_send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.cynojine.sms.controllers.APIController.createSendSMSAsync") createSendSMSAsync

> TODO: Add a method description


```java
void createSendSMSAsync(
        final String apiKey,
        final String to,
        final String sms,
        final String from,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apiKey |  ``` Required ```  ``` DefaultValue ```  | set your API_KEY from http://sms.cynojine.com/sms-api/info (user panel) |
| to |  ``` Required ```  ``` DefaultValue ```  | the number we are sending to - Any phone number |
| sms |  ``` Required ```  | SMS Body |
| from |  ``` Required ```  | Change the from number below. It can be a valid phone number or a String |


#### Example Usage

```java
String apiKey = "xxxxxxxxxxxxx";
String to = "260986";
String sms = "sms";
String from = "from";
// Invoking the API call with sample inputs
client.createSendSMSAsync(apiKey, to, sms, from, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_balancecheck_async"></a>![Method: ](https://apidocs.io/img/method.png "com.cynojine.sms.controllers.APIController.getBALANCECHECKAsync") getBALANCECHECKAsync

> Checking SMS Balance


```java
void getBALANCECHECKAsync(
        final GetBALANCECHECKInput input,
        final Map<String, Object> queryParameters,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apiKey |  ``` Required ```  | Get your account balance |
| response |  ``` Required ```  ``` DefaultValue ```  | Json Responce |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```java
GetBALANCECHECKInput collect = new GetBALANCECHECKInput();

String apiKey = "api_key";
collect.setApiKey(apiKey);

String response = "json";
collect.setResponse(response);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
client.getBALANCECHECKAsync(collect, , queryParams, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)



