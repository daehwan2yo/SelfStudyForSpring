## Self Study for Spring Framework with ATDD
### daehwan2yo  
해당 레포지토리는 Spring Framework 를 상기시킬겸 공부와 동시에  
주어진 요구사항을 ATDD에 기반하여 해결해나가는 공부를 하기 위함이다.


### reference
> 인프런 - 스프링 핵심 원리 기본편, 김영한 선생님  
> nextstep - ATDD

## 디렉토리 구조

[springFramework]  
|- [library] : interface 들을 모아둔 디렉토리   
|&nbsp;&nbsp;&nbsp;&nbsp;|- [repository] : 저장소와 관련된 interface  
|&nbsp;&nbsp;&nbsp;&nbsp;|- [service] : 비즈니스 로직과 관련된 interface  
|&nbsp;&nbsp;&nbsp;&nbsp;|- [ui] : controller 와 관련된 interface  
|- [application] : 구현체 (도메인, 비즈니스 로직) 들을 모아둔 디렉토리  
|&nbsp;&nbsp;&nbsp;&nbsp;|- [domain] : 도메인 로직 구현체  
|&nbsp;&nbsp;&nbsp;&nbsp;|- [service] : 비즈니스 로직 구현체  
|&nbsp;&nbsp;&nbsp;&nbsp;|- [repository] : 저장소 로직 구현체  
|&nbsp;&nbsp;&nbsp;&nbsp;|- [ui] : controller 구현체  

## 🚀 요구사항

### 회원
 회원을 가입하고 조회할 수 있다.   
 회원은 일반과 VIP 두 가지 등급이 존재한다.   
 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다.   

**Feature : 회원 관리 기능**  
- [ ] **사용자가 회원가입을 할 수 있다.**  
<img width="640" alt="스크린샷 2022-03-02 오전 1 01 29" src="https://user-images.githubusercontent.com/26921986/156203593-67302d54-b94d-4c4a-860f-879b0ed713fe.png">

- [ ] **사용자의 회원 정보를 조회할 수 있다.**  
![스크린샷 2022-02-10 오전 12 41 11](https://user-images.githubusercontent.com/26921986/153235645-fa5fb29f-72e7-47c3-bf1b-465bbd1230b0.png)

- [ ] **회원의 등급을 변경할 수 있다.**  
![스크린샷 2022-02-10 오전 12 53 48](https://user-images.githubusercontent.com/26921986/153238182-10388346-f7b9-4138-9086-2e46c7345bed.png)  
![스크린샷 2022-02-10 오전 12 54 04](https://user-images.githubusercontent.com/26921986/153238223-357290aa-c3c5-4720-b4d7-4657695f87d2.png)


### 주문
**회원은 상품을 주문할 수 있다.**

### 할인
**회원은 등급에 따라 할인 정책을 적용할 수 있다.**

**할인 정책은 미정이다.**
- 모든 VIP 는 1000원을 할인해주는 고정 금액 할인을 우선 적용해야한다.
- 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못하였으며, 오픈 직전까지 고민을 미룬다.
