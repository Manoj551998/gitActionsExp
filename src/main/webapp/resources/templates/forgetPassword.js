(function() {
  var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['forgetPassword'] = template({"1":function(container,depth0,helpers,partials,data) {
    var helper, lookupProperty = container.lookupProperty || function(parent, propertyName) {
        if (Object.prototype.hasOwnProperty.call(parent, propertyName)) {
          return parent[propertyName];
        }
        return undefined
    };

  return "<h3>Password:<strong>"
    + container.escapeExpression(((helper = (helper = lookupProperty(helpers,"password") || (depth0 != null ? lookupProperty(depth0,"password") : depth0)) != null ? helper : container.hooks.helperMissing),(typeof helper === "function" ? helper.call(depth0 != null ? depth0 : (container.nullContext || {}),{"name":"password","hash":{},"data":data,"loc":{"start":{"line":10,"column":57},"end":{"line":10,"column":69}}}) : helper)))
    + "</strong></h3>";
},"compiler":[8,">= 4.3.0"],"main":function(container,depth0,helpers,partials,data) {
    var stack1, lookupProperty = container.lookupProperty || function(parent, propertyName) {
        if (Object.prototype.hasOwnProperty.call(parent, propertyName)) {
          return parent[propertyName];
        }
        return undefined
    };

  return "<div id=\"outsideContainer\">\n    <div id=\"container\">\n        <h1>Forgot password</h1>\n       		<h4>Back to login page <a href=\"login\">LogIn</a></h4><br>\n       		<label>Enter email</label><br>\n            <input type=\"text\" id=\"ForgetPassword-email\" name=\"email\"placeholder=\"secret-code\"><br>\n            <label>Enter secretCode</label><br>\n            <input type=\"text\" id=\"ForgetPassword-secretCode\" name=\"secret\"placeholder=\"secret-code\"><br>\n            <input type=\"button\" value=\"Get Password\" onclick=\"getPassword()\">\n            <center>"
    + ((stack1 = lookupProperty(helpers,"if").call(depth0 != null ? depth0 : (container.nullContext || {}),(depth0 != null ? lookupProperty(depth0,"password") : depth0),{"name":"if","hash":{},"fn":container.program(1, data, 0),"inverse":container.noop,"data":data,"loc":{"start":{"line":10,"column":20},"end":{"line":10,"column":90}}})) != null ? stack1 : "")
    + "</center>\n    </div>\n</div>";
},"useData":true});
})();