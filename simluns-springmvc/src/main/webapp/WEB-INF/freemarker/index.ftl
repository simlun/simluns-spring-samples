<#import "spring.ftl" as spring />
<!doctype html>
<html>
	<head>
		<meta charset="utf-8"> 
		<title><@spring.message "index.title"/></title>
	</head>
	<body>
		<h1><@spring.message "index.title"/></h1>
		<ul>
			<li><@spring.message "index.listPeopleAs"/> [ <a href="<@spring.url "/people/list.html"/>">html</a> | <a href="<@spring.url "/people/list.json"/>">json</a> ]</li>
			<li><@spring.message "index.chooseLanguage"/> [ <a href="<@spring.url "/?locale=en"/>"><@spring.message "index.english"/></a> | <a href="<@spring.url "/?locale=sv"/>"><@spring.message "index.swedish"/></a> ]</li>
		</ul>
	</body>
</html>
