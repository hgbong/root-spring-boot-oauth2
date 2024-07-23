1. /etc/hosts 파일에 authz-server url 등록
   - 127.0.0.1 auth-server
2. authz-server, resource-server, oauth2-client 서버 구동
3. 아래 순서로 테스트 진행
   1. GET http://127.0.0.1:8080/articles 브라우저 접속 (resource server 자원)
   2. auth-server의 login 페이지 리다이렉트 확인
   3. 로그인 (user/1234 또는 admin/1234)
   4. /articles 데이터 정상 조회 확인

reference: https://www.baeldung.com/spring-security-oauth-auth-server