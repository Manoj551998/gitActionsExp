var jQuery = document.createElement('script');
jQuery.src = 'https://code.jquery.com/jquery-3.4.1.min.js';
jQuery.type = 'text/javascript';
document.getElementsByTagName('head')[0].appendChild(jQuery);

var handleBars=document.createElement('script');
handleBars.src='https://cdn.jsdelivr.net/npm/handlebars@latest/dist/handlebars.js';
handleBars.type='text/javascript';

function register()
{
	let email=$("#SignupEmail").val();
	let password=$("#SignupPassword").val();
	let secretCode=$("#SignupSecretCode").val();
	$.ajax(
	{
			url: 'register',
			type: "post",
			contentType: "application/json; charset=utf-8",
			data: JSON.stringify({
				"email": email,
				"password": password,
				"secret": secretCode
			}),
		success:function(data)
		{
			window.location="login";
		},
		error:function(error)
		{
			console.log(error);
			alert(error.responseJSON.message);
		}
	})
}

function login()
{
	let email=$("#Login-email").val();
	let password=$("#Login-password").val();
	$.ajax(
	{
			url: 'login',
			type: "post",
			contentType: "application/json; charset=utf-8",
			data: JSON.stringify({
				"email": email,
				"password": password
			}),
		success:function(data)
		{
			window.location="comments";
		},
		error:function(error)
		{
			alert(error.responseJSON.message);
		}
	})
}

function getPassword()
{
	let email=$("#ForgetPassword-email").val();
	let secretCode=$("#ForgetPassword-secretCode").val();
	let printPassword=document.getElementById('printPassword');
	$.ajax(
	{
			url: 'forgotPassword',
			type: "post",
			contentType: "application/json; charset=utf-8",
			data: JSON.stringify({
				"email": email,
				"secret": secretCode
			}),
		success:function(data)
		{
			let password=data.data[0];
			let result={password};
			
			let passwordResult=Handlebars.templates['forgetPassword'];
			$('#forgetPassword-comes-here').html(passwordResult(result));
			console.log(result);
		},
		error:function(error)
		{
			alert("Invalid SecretCode");
		}
	})
}

function postComment()
{
	let comment=$("#commentbox").val();
	//let email=$("#commentEmail").val();
	
	$.ajax(
	{
			url: 'Comment',
			type: "post",
			contentType: "application/json; charset=utf-8",
			data: JSON.stringify({
				//"email": email,
				"comments": comment
			}),
		
		success:function(data)
		{
			getComments();
		},
		error:function(error)
		{
			alert("comment not added try again");
		}
	})
}
function logout()
{
	$.ajax(
	{
			url: 'logout',
			type: "get",
		
		success:function(data)
		{
			window.location="login";
			
		},
		error:function(error)
		{
			alert("please try again");
		}
	})
}
function getComments()
{
	$.ajax(
	{
			url: 'Comments',
			type: "get",
		
		success:function(data)
		{
			console.log(data);
			let mydata=data.data;
			let comments=mydata;
			let commentsResult=Handlebars.templates['comments'];
			$('#Rendercommentspage').html(commentsResult({array:mydata}));
		},
		error:function(error)
		{
			alert("please try again");
		}
	})
}
