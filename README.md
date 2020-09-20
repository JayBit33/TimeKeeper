**Introduction**

Timekeeper is a time keeping application designed for companies to track employee hours and payroll. Allows both the employer and employees to track and view previous payroll.

**Storyboard / Screen Mockups**

| Start Screen | ![](RackMultipart20200920-4-izp33v_html_de07cc39ced90a63.png) |
| --- | --- |
| Employee Login | ![](RackMultipart20200920-4-izp33v_html_45ffd0ae5bcb3a35.png) |
| Employee Main | ![](RackMultipart20200920-4-izp33v_html_efe61a4198b753ef.png) |
| Employee Current Period | ![](RackMultipart20200920-4-izp33v_html_3c63a9bbbd44c520.png) |
| Employee Payroll | ![](RackMultipart20200920-4-izp33v_html_f7b6d645469cc66d.png) |
| Supervisor Login | ![](RackMultipart20200920-4-izp33v_html_45ffd0ae5bcb3a35.png) |
| Supervisor Payroll | ![](RackMultipart20200920-4-izp33v_html_a400444716b21505.png) |
| Supervisor Edit Payroll | ![](RackMultipart20200920-4-izp33v_html_840ee7c73184bf0f.png) |

**Functional Requirements**

As an Employee

I want to enter my hours for each pay period

So that I can easily submit my time to payroll.

Given I am on the payroll page

When I enter all required fields properly and click submit

Then my hours for the pay period are submitted and stored in a database

Given I am on the payroll page

When I try to submit the payroll form and required fields are missing

Then I receive an error message letting me know I forgot a required field.

As an Employee

I want to view old payroll sheet

So that I can verify my pay.

Given I am logged in

When I click the see payroll history button

Then each of my payroll records are displayed in a table.

As a Supervisor

I want to view all payroll records for a specified period of time

So I can review payroll

Given I am logged in as Supervisor

When I click view all records

Then a table of all employee payroll records are displayed.

Given I am logged in as admin

When I search for a particular employee&#39;s payroll either by name or employee id

Then a table of only that employee&#39;s payroll records are displayed.

As a Supervisor

I want to log in to Supervisor view

So I can view all employee payroll

Given I am on login screen

When I enter my Supervisor username and password correctly

Then I am taken to the Supervisor view where I can view payroll.

**Class Diagram**

![](images class_uml.jpg)

**JSON Schema**

{

&quot;$schema&quot;: &quot;[http://json-schema.org/draft-06/schema](http://json-schema.org/draft-06/schema)#&quot;,

&quot;type&quot;: &quot;array&quot;,

&quot;items&quot;: {

&quot;$ref&quot;: &quot;#/definitions/WelcomeElement&quot;

},

&quot;definitions&quot;: {

&quot;WelcomeElement&quot;: {

&quot;type&quot;: &quot;object&quot;,

&quot;additionalProperties&quot;: false,

&quot;properties&quot;: {

&quot;payrollId&quot;: {

&quot;type&quot;: &quot;integer&quot;

},

&quot;employeeUUID&quot;: {

&quot;type&quot;: &quot;integer&quot;

},

&quot;firstName&quot;: {

&quot;type&quot;: &quot;string&quot;

},

&quot;lastName&quot;: {

&quot;type&quot;: &quot;string&quot;

},

&quot;hoursWorked&quot;: {

&quot;type&quot;: &quot;number&quot;

},

&quot;payStructure&quot;: {

&quot;type&quot;: &quot;string&quot;

},

&quot;amount&quot;: {

&quot;type&quot;: &quot;integer&quot;

}

},

&quot;required&quot;: [

&quot;amount&quot;,

&quot;employeeUUID&quot;,

&quot;firstName&quot;,

&quot;hoursWorked&quot;,

&quot;lastName&quot;,

&quot;payStructure&quot;,

&quot;payrollId&quot;

],

&quot;title&quot;: &quot;WelcomeElement&quot;

}

}

}

**Scrum Roles**

Project manager: Justin Roseman

Business Logic: Juan O. Lopez Rosado

UI: Minh-Dao Vu

**Github Project Link**

[https://github.com/JayBit33/TimeKeeper](https://github.com/JayBit33/TimeKeeper)

**Teams Link for Stand-Ups**
