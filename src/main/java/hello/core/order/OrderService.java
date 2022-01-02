package hello.core.order;

public interface OrderService { //퍼블릭으로 외부에 공개한거라 파일명이랑 일치해야함

    //아이디,상품명,상품가격을 주면 할인가격을 반환해준다라는거의 역할을 만든것
    Order createOrder(Long memberId,String itemName,int itemPrice);
}
