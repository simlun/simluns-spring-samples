<#import "../spring.ftl" as spring />
<!doctype html>
<html>
	<head>
		<meta charset="utf-8"> 
		<title><@spring.message "people.list.title"/></title>
	</head>
	<body>
		<h1><@spring.message "people.list.title"/></h1>
		<ul>
			<#list people as person>
	    		<li>${person.name} [ <a href="<@spring.url "/people/show.html?personId=${person_index}"/>">html</a> | <a href="<@spring.url "/people/show.json?personId=${person_index}"/>">json</a> ]</li>
			</#list>
		</ul>
	</body>
</html>
