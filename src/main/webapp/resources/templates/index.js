(function() {
  var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['index'] = template({"compiler":[8,">= 4.3.0"],"main":function(container,depth0,helpers,partials,data) {
    return "<div id=\"outsideContainer\">\n    <div id=\"container\">\n        <h1>Sign Up</h1>\n       <h4>Already have an account?<a href=\"login\">LogIn</a></h4>\n        <br>\n            <label>Email</label><br>\n            <input type=\"text\" id=\"SignupEmail\" name=\"email\"><br>\n            <label>Password</label><br>\n            <input type=\"password\" id=\"SignupPassword\" name=\"password\"><br>\n            <label>Secret</label><br>\n            <input type=\"password\" id=\"SignupSecretCode\" name=\"secret\"><br>\n            <input type=\"button\" value=\"Sign-Up\" onclick=\"register()\">\n    </div>\n</div>";
},"useData":true});
})();