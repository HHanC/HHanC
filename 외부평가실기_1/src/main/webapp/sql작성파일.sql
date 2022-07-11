-- DB 생성 
CREATE database xe;
-- member 테이블 생성 
		create table xe.member_tbl_02(
			custno int(6) not null primary KEY ,
			custname varchar(20),
			phone varchar(13) ,
			address varchar(60) , 		
			joindate date ,
			grade char(1) ,
			city char(2) 
		);
-- member 데이터 추가 
insert into xe.member_tbl_02 values( 100001 , '김행복' , '010-1111-2222' , '서울 동대문구 휘경1동' ,20151202 , 'A' , '01');
insert into xe.member_tbl_02 values( 100002 , '이축복' , '010-1111-3333' , '서울 동대문구 휘경2동' ,20151206 , 'B' , '01');
insert into xe.member_tbl_02 values( 100003 , '장믿음' , '010-1111-4444' , '울릉군 울릉읍 독도1리' ,20151001 , 'B' , '30');
insert into xe.member_tbl_02 values( 100004 , '최사랑' , '010-1111-5555' , '울릉군 울릉읍 독도2리' ,20151113 , 'A' , '30');
insert into xe.member_tbl_02 values( 100005 , '진평화' , '010-1111-6666' , '제주도 제주시 외나무골' ,20151225 , 'B' , '60');
insert into xe.member_tbl_02 values( 100006 , '차공단' , '010-1111-7777' , '제주도 제주시 감나무골' ,20151211 , 'C' , '60');
--  확인 
select * from xe.member_tbl_02;
-- money 테이블 
create table xe.money_tbl_02(
	custno int(6) not null ,
    salenol int(8) not null , 
    pcost int(8) ,
    amount int(4) ,
    price int(8) , 
    pcode varchar(4) ,
    sdate date ,
    primary key ( custno , salenol )
);
-- money 테이블 데이터추가 
insert into xe.money_tbl_02 values( 100001 ,  2016001 , 500 , 5 , 2500 , 'A001' , 20160101 );
insert into xe.money_tbl_02 values( 100001 ,  2016002 , 1000 , 4 , 4000 , 'A002' , 20160101 );
insert into xe.money_tbl_02 values( 100001 ,  2016003 , 500 , 3 , 1500 , 'A008' , 20160101 );
insert into xe.money_tbl_02 values( 100002 ,  2016004 , 2000 , 1 , 2000 , 'A004' , 20160102 );
insert into xe.money_tbl_02 values( 100002 ,  2016005 , 500 , 1 , 500 , 'A001' , 20160103 );
insert into xe.money_tbl_02 values( 100003 ,  2016006 , 1500 , 2 , 3000 , 'A003' , 20160103 );
insert into xe.money_tbl_02 values( 100004 ,  2016007 , 500 , 2 , 1000 , 'A001' , 20160104 );
insert into xe.money_tbl_02 values( 100004 ,  2016008 , 300 , 1 , 300 , 'A005' , 20160104 );
insert into xe.money_tbl_02 values( 100004 ,  2016009 , 600 , 1 , 600 , 'A006' , 20160104 );
insert into xe.money_tbl_02 values( 100004 ,  2016010 , 3000 , 1 , 3000 , 'A007' , 20160106 );
-- money 확인 
select * from xe.money_tbl_02;

-- 매출
-- 1. 필용한 필드 가져오기  
select custno , custname , grade from member_tbl_02;
-- 2. 두 이상 테이블 합치기 
select A.custno , A.custname , A.grade  from member_tbl_02 A join money_tbl_02 B on A.custno = B.custno;
-- 3. 매출의 합계 
select A.custno , A.custname , A.grade , SUM(B.price) from member_tbl_02 A join money_tbl_02 B on A.custno = B.custno;
-- 4. PK 기준으로 그룹 
select A.custno , A.custname , A.grade , SUM(B.price) 
from member_tbl_02 A 
join money_tbl_02 B 
on A.custno = B.custno
group by  A.custno ;
-- 4. 정렬하기 
select A.custno , A.custname , A.grade , SUM(B.price) 
from member_tbl_02 A 
join money_tbl_02 B 
on A.custno = B.custno
group by  A.custno 
order by SUM( B.price ) DESC;
