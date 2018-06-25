
# 프로젝트 제목 

  &nbsp;&nbsp; &nbsp;  CookieIssue
  
  <br/>
  
# 프로젝트 개요
   <p>&nbsp;&nbsp; &nbsp;  초당 1만번 요청에도 끄떡없는 선착순 쿠키 발급 시스템 </p>
   <p>&nbsp;&nbsp; &nbsp;  SpringSecurity 와 레디스를 사용하여 만들었습니다. </p>
   <p> &nbsp;&nbsp; &nbsp; 레디스는 인메모리DB라 빠른 속도가 강점이지만 큰 용량의 데이터를 담기엔 공간 제약이 크다. <br/>
   &nbsp;&nbsp; &nbsp; 그러므로 한정적인 정보만 저장했습니다. </p>
   <p> &nbsp;&nbsp; &nbsp; 로그인 세션과 쿠키 Count를 Redis에 저장해 초당 만번을 요청해도 지장이 없게 구현했습니다.  </p>

   
  <br/>
  
# 사용 기술
  <br/>
  
  ![redis](https://user-images.githubusercontent.com/24237454/41399391-24b09a8c-6ff5-11e8-9d6f-89bdd96b58d9.PNG)


- 빨간색 : 소스코드, 문서 등을 저장한 공간소와 배포 서버 안내.
- 파란색 : Front-End 영역.
- 초록색 : Back-End 영역.

 
  <br/>
 
# 프로젝트 설명
 
 <br/>
 
![capture01](/image/capture01.png)

쿠키 프로젝트 메인 페이지 접속 결과입니다.

![capture02](/image/capture02.png)

쿠키 페이지 사용자 로그인 페이지입니다.

로그인은 Spring Security를 이용해서 인증 진행을 거칩니다.

![capture03](/image/capture03.png)

쿠키 페이지 일반 사용자 이벤트 참여 페이지입니다.

![capture04](/image/capture04.png)

쿠키 페이지 로그인 하지 않은 사용자 페이지입니다.

여기서는 사용자들의 참여 수치를 확인할 수 있습니다.

![capture05](/image/capture05.png)

쿠키 페이지 관리자 접속 페이지입니다.

여기서는 사용자들의 통계를 관리합니다.
