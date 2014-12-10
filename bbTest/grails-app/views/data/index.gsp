
<%@ page import="org.bb.domain.Data" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'data.label', default: 'Data')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-data" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-data" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					    <g:sortableColumn property="brandId" title="${message(code: 'data.brandId.label', default: '#')}" />

						<g:sortableColumn property="brandId" title="${message(code: 'data.brandId.label', default: 'Product Image')}" />

                        <g:sortableColumn property="name" title="${message(code: 'data.brandName.label', default: 'Brand')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'data.name.label', default: 'Product Name')}" />
					
						<g:sortableColumn property="numberSoldInLast30Days" title="${message(code: 'data.description.label', default: 'Brief Description')}" />

                        <g:sortableColumn property="discontinued" title="${message(code: 'data.numberSoldInLast30Days.label', default: 'Quantity Sold')}" />
					
					</tr>
				</thead>
				<tbody>
                <%
                    Integer count = Integer.valueOf(offset == null ? 0 : offset);
                     //count = Integer.valueOf(${offset ?: 0}) + Integer.valueOf(${max ?: 0});

                %>

				<g:each in="${dataInstanceList}" status="i" var="dataInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                        <td>${(count + i + 1)}</td>
					
						<td><g:img uri="http://store.bbcomcdn.com${dataInstance.white70PxImgUrl}"/></td>

                        <td><g:link url="http://www.bodybuilding.com/store${dataInstance.brandUrl}" id="${dataInstance.brandName}">${fieldValue(bean: dataInstance, field: "brandName")}</g:link></td>

                        <td><g:link url="http://www.bodybuilding.com/store${dataInstance.productUrl}" id="${dataInstance.productUrl}">${fieldValue(bean: dataInstance, field: "name")}</g:link></td>

						<td>${fieldValue(bean: dataInstance, field: "description")}</td>
					
						<td>${fieldValue(bean: dataInstance, field: "numberSoldInLast30Days")}</td>

					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dataInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
