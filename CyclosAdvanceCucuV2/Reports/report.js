$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Payment.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file is to validate the payment functionalities of Cyclos Website.",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate whether payment is being made to any existing user is successful.",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-any-existing-user-is-successful.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@DataTable"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Required website is launches also the business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Below are the payment details like payee and amount",
  "rows": [
    {
      "cells": [
        "User",
        "Amount"
      ],
      "line": 7
    },
    {
      "cells": [
        "Nicola  Tesla",
        "1"
      ],
      "line": 8
    },
    {
      "cells": [
        "Hotel  Oasis",
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "Henry  George",
        "1"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "System is able to make the payments to desired user with specified amount",
  "keyword": "Then "
});
formatter.match({
  "location": "PayDataTableTC1.required_website_is_launches_also_the_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 31418191600,
  "status": "passed"
});
formatter.match({
  "location": "PayDataTableTC1.below_are_the_payment_details_like_payee_and_amount(DataTable)"
});
formatter.result({
  "duration": 25450840800,
  "status": "passed"
});
formatter.match({
  "location": "PayDataTableTC1.system_is_able_to_make_the_payments_to_desired_user_with_specified_amount()"
});
formatter.result({
  "duration": 99324200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Validate whether payment is being made to existing user is successful through ScnOutline",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Website launched after that business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Data details are User \"\u003cUser\u003e\"  Amount \"\u003cAmount\u003e\" system is able to make the payment.",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "System is able to make the required payment to the users",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;",
  "rows": [
    {
      "cells": [
        "User",
        "Amount"
      ],
      "line": 19,
      "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;1"
    },
    {
      "cells": [
        "Nicola  Tesla",
        "2"
      ],
      "line": 20,
      "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;2"
    },
    {
      "cells": [
        "Hotel  Oasis",
        "2"
      ],
      "line": 21,
      "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;3"
    },
    {
      "cells": [
        "Henry  George",
        "2"
      ],
      "line": 22,
      "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Validate whether payment is being made to existing user is successful through ScnOutline",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Website launched after that business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Data details are User \"Nicola  Tesla\"  Amount \"2\" system is able to make the payment.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "System is able to make the required payment to the users",
  "keyword": "Then "
});
formatter.match({
  "location": "PayOutlineTC2.website_launched_after_that_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 27039224100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nicola  Tesla",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 47
    }
  ],
  "location": "PayOutlineTC2.data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String,String)"
});
formatter.result({
  "duration": 11707860600,
  "status": "passed"
});
formatter.match({
  "location": "PayOutlineTC2.system_is_able_to_make_the_required_payment_to_the_users()"
});
formatter.result({
  "duration": 99613800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate whether payment is being made to existing user is successful through ScnOutline",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Website launched after that business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Data details are User \"Hotel  Oasis\"  Amount \"2\" system is able to make the payment.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "System is able to make the required payment to the users",
  "keyword": "Then "
});
formatter.match({
  "location": "PayOutlineTC2.website_launched_after_that_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 25477643400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel  Oasis",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 46
    }
  ],
  "location": "PayOutlineTC2.data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String,String)"
});
formatter.result({
  "duration": 15898942300,
  "status": "passed"
});
formatter.match({
  "location": "PayOutlineTC2.system_is_able_to_make_the_required_payment_to_the_users()"
});
formatter.result({
  "duration": 92881600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate whether payment is being made to existing user is successful through ScnOutline",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-through-scnoutline;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Website launched after that business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Data details are User \"Henry  George\"  Amount \"2\" system is able to make the payment.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "System is able to make the required payment to the users",
  "keyword": "Then "
});
formatter.match({
  "location": "PayOutlineTC2.website_launched_after_that_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 22744396600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Henry  George",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 47
    }
  ],
  "location": "PayOutlineTC2.data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String,String)"
});
formatter.result({
  "duration": 14029300900,
  "status": "passed"
});
formatter.match({
  "location": "PayOutlineTC2.system_is_able_to_make_the_required_payment_to_the_users()"
});
formatter.result({
  "duration": 95643600,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate whether payment is being made to existing user is successful by fetching data from external csv file",
  "description": "",
  "id": "this-feature-file-is-to-validate-the-payment-functionalities-of-cyclos-website.;validate-whether-payment-is-being-made-to-existing-user-is-successful-by-fetching-data-from-external-csv-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@PayUser_DataDrivenExternalSource"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "Launching the Cyclos website after that using the account id with passowrd to gain access to proceed further",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Data is being fetched from \"./TestData/CyclosNew.csv\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Payment is being made by the system",
  "keyword": "Then "
});
formatter.match({
  "location": "PayCSVDataTC3.launching_the_Cyclos_website_after_that_using_the_account_id_with_passowrd_to_gain_access_to_proceed_further()"
});
formatter.result({
  "duration": 25106060000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "./TestData/CyclosNew.csv",
      "offset": 28
    }
  ],
  "location": "PayCSVDataTC3.data_is_being_fetched_from(String)"
});
formatter.result({
  "duration": 24345049800,
  "status": "passed"
});
formatter.match({
  "location": "PayCSVDataTC3.payment_is_being_made_by_the_system()"
});
formatter.result({
  "duration": 105160100,
  "status": "passed"
});
});