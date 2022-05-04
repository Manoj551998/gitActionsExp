(function() {
  var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['comments'] = template({"1":function(container,depth0,helpers,partials,data) {
    return "		<div>		\n    		"
    + container.escapeExpression(container.lambda(depth0, depth0))
    + "\n  		</div>\n";
},"compiler":[8,">= 4.3.0"],"main":function(container,depth0,helpers,partials,data) {
    var stack1, lookupProperty = container.lookupProperty || function(parent, propertyName) {
        if (Object.prototype.hasOwnProperty.call(parent, propertyName)) {
          return parent[propertyName];
        }
        return undefined
    };

  return "<div id=\"wrapper\">\n	<div><button onclick=\"logout()\">Logout</button></div>\n	<label for=\"commentbox\">Write your post here</label><br>\n	<textarea id=\"commentbox\" name=\"comments\" rows=\"4\" cols=\"50\"></textarea>\n	<br>\n	<button onclick=\"postComment()\">Submit </button>\n	<div id=\"renderComments\">\n"
    + ((stack1 = lookupProperty(helpers,"each").call(depth0 != null ? depth0 : (container.nullContext || {}),(depth0 != null ? lookupProperty(depth0,"array") : depth0),{"name":"each","hash":{},"fn":container.program(1, data, 0),"inverse":container.noop,"data":data,"loc":{"start":{"line":8,"column":2},"end":{"line":12,"column":11}}})) != null ? stack1 : "")
    + "	</div>\n	</div>";
},"useData":true});
})();