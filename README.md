# spring-security-basic-project
블로그 [스프링 시큐리티 설명 글](https://nahwasa.com/entry/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-Spring-Security-%EA%B8%B0%EB%B3%B8-%EC%84%B8%ED%8C%85-%EC%8A%A4%ED%94%84%EB%A7%81-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0) 예시용 프로젝트

기본 형태의 스프링 시큐리티만 적용한 프로젝트.
1. 자바 gradle 프로젝트 생성
2. 스프링 starter web(내장 톰캣용) gradle에 추가
3. 스프링 시큐리티 gradle에 추가
4. jsp 사용을 위해 jstl, tomcat-embed-jasper 추가
5. 기본이라 생각하는 lombok 추가
6. application.properties 생성 후 기본적인 설정(port, jsp파일 prefix, suffix)

---
DummyOfUserMapper는 DB 더미입니다. 실제론 DB에서 가져와야 합니다.
SHA512로 암호화 했으므로 이미 DB에 SHA512로 인코딩 된 암호가 들어있다고 가정했습니다.

---
통과 되는 id, pw는 DummyOfUserMapper에 있습니다. 기본으로는
id/pw = dev/1234
로 통과됩니다.
