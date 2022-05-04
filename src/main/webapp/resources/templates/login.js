(function() {
  var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['login'] = template({"compiler":[8,">= 4.3.0"],"main":function(container,depth0,helpers,partials,data) {
    return "<div id=\"outsideContainer\">\n    <div id=\"container\">\n        <h1>Login</h1>\n       		<h4>Not have an account?<a href=\"signup\">SignUp</a></h4><br>\n            <label>Enter Email</label><br>\n            <input type=\"text\" id=\"Login-email\" name=\"email\"placeholder=\"e-mail\"><br>\n            <label>Enter password</label><br>\n            <input type=\"password\" id=\"Login-password\" name=\"password\"placeholder=\"password\"><br>\n            <a href=\"forgotPassword\">Forget password</a>\n            <br>\n            <input type=\"button\" value=\"Login\" onclick=\"login()\">\n    </div>\n</div>";
},"useData":true});
})();