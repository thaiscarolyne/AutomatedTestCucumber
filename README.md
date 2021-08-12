# AutomatedTestCucumber
This repository contains two projects, one is the api, and the other is the automated test for that api.
When you run the api project with qa profile, it will use the wiremock URL, which request and response were mapped in the folder: local/wiremock/stubs

## How to run this tests?

1. Inside the **API** project, access the local folder
2. Run this command to run a wiremock container: docker-compose up -d --build
3. Now run the project with the profile qa
    * To do so, edit configuration for run/debug and paste this on VM options: -Dmicronaut.environments=qa
4. Finally, open the **TEST** project and run the tests through the Runner class

You should see the result saying that 1 scenario and 2 steps passed.

References:
* https://www.devmedia.com.br/desenvolvimento-orientado-a-comportamento-bdd-com-cucumber/33547
* https://www.baeldung.com/rest-assured-tutorial
* https://cucumber.io/docs/tools/java/
