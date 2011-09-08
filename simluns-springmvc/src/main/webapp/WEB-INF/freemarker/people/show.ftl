<#import "../spring.ftl" as spring />
<!doctype html>
<html>
	<head>
		<meta charset="utf-8"> 
		<title><@spring.message "people.show.title"/>: ${person.name}</title>
	</head>
	<body>
		<h1><@spring.message "people.show.title"/>: ${person.name}</h1>
		<p>${person}</p>
	</body>
</html>
