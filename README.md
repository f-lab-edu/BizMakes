# BizMakes
> 서버 접속 주소: http://ec2-52-78-48-184.ap-northeast-2.compute.amazonaws.com:8080

## 기술 스택

- Kotlin SpringBoot
- Spring Web MVC, Data JPA
- MySQL, H2
- 인프라: AWS EC2/RDS

## Figma

> https://www.figma.com/design/gR9vAWTzd4X1O2XsfTMGg6

![CleanShot 2024-11-04 at 19 29 30@2x](https://github.com/user-attachments/assets/2aefd129-c7c0-4d40-8ebe-155e9b222076)
![CleanShot 2024-11-04 at 19 29 40@2x](https://github.com/user-attachments/assets/3bacbf70-13df-490f-8121-22a5f9a90b73)
![CleanShot 2024-11-04 at 19 29 46@2x](https://github.com/user-attachments/assets/224feebe-f342-43f5-a179-a9f810059af2)

## ERD

> https://www.erdcloud.com/d/MGydqQnvBNfXm6pBq

![BizMakes](https://github.com/user-attachments/assets/93c842a0-f12d-4e23-b2dc-cf457cc2498e)

## 요구사항

### User
- 회원가입
- 로그인
- 로그아웃
- 내 정보 수정
- 탈퇴

### ProductCategory, Product
- 특정 카테고리의 모든 상품 목록을 조회한다
- 특정 상품 상세페이지를 조회한다
- 특정 상품의 가능한 모든 옵션 조합을 조회한다
    - 각 상품별로 옵션들이 다양하다. 같은 옵션을 여러 상품이 공유할 수도 있다.
    - 각 옵션 항목마다 선택할 수 있는 값들이 있다
    - 옵션 조합의 경우의 수가 많아질 수 있다. 예를 들어 17*28*10*4=19,040개의 옵션조합이 나올 수도 있다.
- 특정 상품의 옵션 조합에 대해 가격을 조회한다

### Cart
- 상품을 장바구니에 담는다
- 장바구니 아이템을 수정한다
    - 옵션조합
    - 개수
- 장바구니 아이템을 삭제한다

### Order
- 주문한다
- 주문 목록을 조회한다
- 주문 상세를 조회한다

### 인트라 페이지
- 특정 상품의 옵션 조합에 대해 가격을 설정한다
    - 모든 경우의 수를 수동으로 하나하나 설정하도록 한다
    - 설정하지 않은 것은 판매하지 않음
