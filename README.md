# ParallelProgrammingModelsAndEXamples
병렬프로그래밍

오늘부터 병렬프로그래밍에 대한 정리를 하면서 작업을 들어 갈건데요.

자바에서 동기화를 위한 기본 수단은 synchronized 키워드로서 베타적인 락을 통해 보호 할 수 있는데요.
volatile변수, 명시적 락, 단일 연산 변수(atomatic variable) 을 사용하는 경우에도 동기화라고 부릅니다.


여러스레드가 변경할 수 있는 하나의 상태 변수를 적절한 동기화 없이 접근하면 그 프로그램은 분명 잘못된 것 입니다.
이렇게 잘못된 프로그램을 고치는데는 세가지 방법이있습니다.

1. 해당 상태 변수를 스레드 간에 공유하지 않는다.
2. 해당 상태 변수를 변경할 수 없도록 만든다
3. 해당 상태 변수를 접근 할땐 언제나 동기화를 사용한다.

클래스를 설계하면서 애당초 동시 접근을 염두에 두지 않았다면, 뒤늦게 위 세가지 방법중에 일부를 적용하고자 하면
그 설계를 상당히 많이 고쳐야할 가능성이 높기 때문에 절대 간단한 작업이 아니다.
스레드 안정성을 확보하기 우해 나중에 클래스를 고치는 것보다 애당초 스레드에 안전하게 설계 하는게 제일 중요하다.

만약에 클래스를 잘 구성하고 유지보수가 쉽게 만드는데 도움이 되도록 객체 지향 프로그래밍 기법에서 사용하는 캡슐화나 데이터 은닉등을 사용하면
스레드에 안전한 클래스를 작성하는데 도움이된다.

즉 스레드에 안전한 클래스를 설계하기 위해선 객체지향적인 기법이 제일 중요하며 캡슐화와 불변 객체를 잘 활용하고, 불변 조건을 명확하게 기술해야한다.

스레드의 안정성 정의:
여러 프로그램 스레드에서 스레드간에 원치않는 상호 작용없이 호출할 수 있는 
호출하는 측 에서 다른 작업을 하지 않고도 여러스레드에서 동시에 호출할수 있는
것을 스레드의 안정성으로 규정한다.

