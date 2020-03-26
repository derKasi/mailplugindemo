# Grails 4 Mail Example Application
A sample Grails 4.0.2 application configured with the mail plugin 3.0.0. The main controller is HelloController.groovy which is configured with /maildemo endpoint to test send an email.

## Running Application

You can run the application by executing the following commands from the Windows Command Prompt as:

```
gradlew.bat bootRun -Dgrails.mail.default.to=receiptientemailaddress -Dgrails.mail.username=youraddress@gmail.com -Dgrails.mail.password=yourpassword
```

*NOTE: * I have tested this application in macOS and Windows 10 using Virtualbox VM.
