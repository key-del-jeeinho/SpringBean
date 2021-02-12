#Spring Bean 기능 명세서

- - -

- SpringBean
    
    id 와 class 속성을 기본적으로 가지고있음
    - id : 해당 빈의 식별자(String)
    - class : 해당 빈 오브젝트의 클래스 주소(리플렉션을 통해 해당 객체를 가져오기 위함)
    추가적으로 scope 와 init-method, destruction method 라는 속성과 property 라는 하위정보를 가지고있음
    - scope : 해당 빈을 생성 / 관리하는 방식
        - singleton : 하나의 bean 정의에 대해 Spring IoC Container 내에 단 하나의 객체만 존재함
        - prototype : 모든 bean 요청마다 새로운 객체를 생성해 가져옴
    - initialization method : 해당 빈 오브젝트가 타 빈에 DI 될떄, 해당 DI작업 이후 실행되는 메소드
    - destruction method : 컨테이너가 종료될때 호출되는 메소드
    - property : 해당 빈 내에 DI 가 필요한 객체나 값에 대해 메타데이터를 제공하는 기능
        - name : 해당 DI 를 위한 세터의 이름 (세터의 명이 setXxx 일때 name 은 xxx 이다)
        - ref / value : DI 할 객체 혹은 값 (둘중 한 속성만 적용가능)
            - ref : 빈을 주입할경우 사용하는 속성, 빈의 id 를 값으로 한다.
            -value : 원시형 값을 주입할경우 사용하는 속성, 문자열로 값을 받아 타입추론을 통해 적절한 값으로 변환하여 주입한다.
    
- ApplicationContext
    getBean 메서드를 통해 빈을 가져올 수 있으며, 이때 해당 메서드의 매개변수는 다음과 같이 존재한다
    1. String id, Class<T> beanClass : 빈의 아이디 및 클래스 둘 다 매개변수로 받는 메서드
    2. String id : 빈의 아이디를 매개변수로 받는 메서드
    3. Class<T> beanClass : 빈의 객체타입을 매개변수로 받는 매서드
    
    - GenericXmlApplicationContext
        
        xml 을 통해서 bean 에 대한 기능을 제공하는 어플리케이션 컨택스트
        beans 라는 root 태그 및에 빈마다 bean 이라는 태그를 통해 빈에대한 메타데이터를 저장한다
        bean 에는 필수적으로 id 와 class 라는 속성이 필요하며, 부가적으로 scope, init-method, destroy-method라는 속성을 추가 가능하다
      
        또한, property 라는 하위태그를 가질 수 있으며, 해당 하위태그에는 name 이라는 속성과 ref/value 둘중하나의 속성을 가지고 있다
    
(원래 스프링빈이 지원하는 이보다 훨씬 많은 기능은 추후 추가될 예정입니다)