---

## 프로젝트 소개

---

로그인 기능과 게시글을 읽거나 작성, 수정, 삭제 등 CRUD기능을 포함한 기본적인 게시판을 구현했습니다. 
Spring을 이용해서 MVC모델을 구현했고, Model과 View, Controller 모두 JAVA를 주로 사용하였습니다. 

---

## 개발환경 및 개발도구

---

- Eclipse(2021-03)
- JDK1.8
- Maven 3.8.1
- STS 4.2.4
- MySQL 8.0.23
- Mybatis 3.3.1

---

## 프로젝트 Use Case Diagram

---

## 상세 기능

---

- [게시글 목록보기](#게시글-목록-보기)
- [게시글 상세보기](#게시글-상세-보기)
- [게시글 등록](#게시글-등록)
- [게시글 수정](#게시글-수정)
- [게시글 삭제](#게시글-삭제)
- [조회수 증가](#조회수-증가)
- [다국어 설정](#다국어-설정)
- [로그인](#로그인)

---

## 게시글 목록 보기

: Mysql에 저장된 모든 게시글들의 제목과 게시글 번호, 조회수 등의 정보를 표시합니다.
Select구문을 통해서 값을 받아오고 화면에 표시합니다.
제목을 클릭할 경우 게시글 번호값을 매개로 게시글 상세 보기 페이지로 이동합니다.

---


## 게시글 상세 보기

: 게시글 번호값을 통해서 게시글의 상세 내용을 확인합니다.
제목, 내용, 조회수, 작성자, 작성시간 등의 정보를 확인할 수 있습니다.

---

## 게시글 등록

: 새로운 게시글을 등록합니다.
입력된 정보는 Mysql에 자동으로 저장됩니다.
작성시간은 현재 시간을 기준으로 작성됩니다.
이용자는 제목과 작성자, 내용 등을 입력합니다.

---

## 게시글 수정

: 이미 작성된 게시글을 수정합니다.
작성자를 수정할 수는 없으며 제목과 내용을 수정할 수 있습니다.

---

## 게시글 삭제

: 이미 작성된 게시글을 삭제합니다.
게시글 번호를 매개로 받아와서 삭제합니다.

---

## 조회수 증가

---

## 다국어 설정

---

## 로그인

---