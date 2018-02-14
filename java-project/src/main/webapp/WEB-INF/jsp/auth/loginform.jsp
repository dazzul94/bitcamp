<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>로그인</h1>

<form action="login" method='post'>

<div class='form-group row'>
	<label for='email' class='col-sm-2 col-form-label'>이메일</label>
	<div class='col-sm-10'>
	<input class='form-control' id='email' type='text' 
	       name='email' value='${cookie.email.value}'>
	</div>
</div>

<div class='form-group row'>
	<label for='password' class='col-sm-2 col-form-label'>암호</label>
	<div class='col-sm-10'>
	<input class='form-control' id='password' type='password' name='password'>
	</div>
</div>

<div class='form-group row'>
	<div class="col-sm-2"></div>
	<div class="col-sm-10">
	  <div class="form-check">
	    <input type="checkbox" class="form-check-input"
	           id="saveEmail" name="saveEmail">
	    <label class="form-check-label" for="saveEmail">이메일 저장</label>
	  </div>
	</div>
</div> 

<div class='form-group row'>
	<div class='col-sm-10'>
	<button class='btn btn-primary btn-sm'>로그인</button>
	<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
	</fb:login-button>
	</div>
</div>

</form>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>
<script type="text/javascript">

function autoServerLogin(accessToken) { 
    //로그인 성공한 후 서버에 자동으로 로그인하기 , 페이스북으로부터 사용자 정보를 가져올수 있도록 서버로 accessToken을 보내야한다.
    location.href = "facebookLogin?accessToken=" + accessToken;  
    
}


//상태 변경에 대해서 콜백한다
function statusChangeCallback(response) {
    console.log(response);
    if (response.status === 'connected') { //정상 로그인
        autoServerLogin(response.authResponse.accessToken);
    } else { //로그인이 안됌
        console.log('로그인 안됌')
    }
  }

function checkLoginState() {
    FB.getLoginStatus(function(response) { //함수를 등록하는 것이고 로그인 정보를 가져오면 이 함수가 호출된다
        statusChangeCallback(response); //response가 로그인 정보다 여기서 이메일 이름 가져올수이따
      });
}

//페이스북 자바스크립트 sdk 파일을 가져온 후에 호출할 함수를 등록한다(선언). 함수를 등록하는 것이지 호출하는 것이 아니다.
window.fbAsyncInit = function() {
    FB.init({
      appId      : '153676722101638',
      cookie     : true,  // enable cookies to allow the server to access 
                          // the session
      xfbml      : true,  // parse social plugins on this page
      version    : 'v2.8' // use graph api version 2.8
    });
  };
  
  
//sdk를 로드하는건 페이스북 라이브러리를 로드하는것? =>개발자 도구 source 보면 된다 거기에 페이스북 관련 함수가 다 들어있다
(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];  //script 태그 0번째를 찾는다.
    if (d.getElementById(id)) return;    //값이 한개라도 있으면 true를 리턴한다.
    js = d.createElement(s); js.id = id; //script 태그를 하나 만들고 js의 id속성에 파라미터로 받은 id를 넣는다
    js.src = "https://connect.facebook.net/en_US/sdk.js"; //src속성에 이거 넣는다.
    fjs.parentNode.insertBefore(js, fjs); //부모는 body  첫 스크립트 태그 전에 넣는다 (맨처음 script가 된다)=>개발자도구의 elemnet 확인하면 있다
  }(document, 'script', 'facebook-jssdk'));

  </script>
</body>
</html>
    