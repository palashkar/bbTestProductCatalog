
<%@ page import="org.bb.domain.Data" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'data.label', default: 'Data')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-data" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-data" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list data">
			
				<g:if test="${dataInstance?.brandId}">
				<li class="fieldcontain">
					<span id="brandId-label" class="property-label"><g:message code="data.brandId.label" default="Brand Id" /></span>
					
						<span class="property-value" aria-labelledby="brandId-label"><g:fieldValue bean="${dataInstance}" field="brandId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="data.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${dataInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataInstance?.discontinued}">
				<li class="fieldcontain">
					<span id="discontinued-label" class="property-label"><g:message code="data.discontinued.label" default="Discontinued" /></span>
					
						<span class="property-value" aria-labelledby="discontinued-label"><g:fieldValue bean="${dataInstance}" field="discontinued"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="data.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${dataInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataInstance?.numberSoldInLast30Days}">
				<li class="fieldcontain">
					<span id="numberSoldInLast30Days-label" class="property-label"><g:message code="data.numberSoldInLast30Days.label" default="Number Sold In Last30 Days" /></span>
					
						<span class="property-value" aria-labelledby="numberSoldInLast30Days-label"><g:fieldValue bean="${dataInstance}" field="numberSoldInLast30Days"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataInstance?.productUrl}">
				<li class="fieldcontain">
					<span id="productUrl-label" class="property-label"><g:message code="data.productUrl.label" default="Product Url" /></span>
					
						<span class="property-value" aria-labelledby="productUrl-label"><g:fieldValue bean="${dataInstance}" field="productUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dataInstance?.white70PxImgUrl}">
				<li class="fieldcontain">
					<span id="white70PxImgUrl-label" class="property-label"><g:message code="data.white70PxImgUrl.label" default="White70 Px Img Url" /></span>
					
						<span class="property-value" aria-labelledby="white70PxImgUrl-label"><g:fieldValue bean="${dataInstance}" field="white70PxImgUrl"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:dataInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${dataInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
