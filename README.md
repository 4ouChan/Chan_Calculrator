## 계산기 만들기 클래스 다이어그램

<img src="https://github.com/user-attachments/assets/a0a8c8ec-7086-41aa-8b86-b6c295aeb370" width="200" height="auto" />  <img src="https://github.com/user-attachments/assets/5ca4fa1c-3dfc-4cc6-b215-8f1d832b81e2" width="200" height="auto" /> <img src="https://github.com/user-attachments/assets/5910f916-3a66-4e03-b807-5344f64e8039" width="200" height="auto" />

lv1 -> lv2 -> lv3

## 성공했다 생각하는 것
- [x] Lv1: 기본 계산기 로직 구현
- [x] Lv2: 클래스 분리 (App + Calculator)
- [x] 결과 저장 기능 (ArrayList)
- [x] 연산 결과 출력
- [x] Lv3: enum 클래스(OperatorType) 도입



##  설명
- Lv1에서는 단일 클래스 기반 계산기를 만들고, Lv2에서는 기능 분리를 통해 클래스 간의 역할을 분리했으며, lv3에서는 enum,제네릭,람다 등을 활용해야했지만 제네릭 단계에 막혀 실패했습니다.
  - lv1 : 단일 클래스에 변수를 선언하고, 스캐너를 활용해 데이터를 입력받아서 해당 데이터로 계산하는 기능을 만들었습니다. 나눗셈 할 때 소숫점도 표현해보고자 연산 기능의 나눗셈 부분에서 indexOne과 indexTwo를 double형으로 캐스팅 했었는데, 다른 문제를 마주해 삭제했습니다.
  - lv2 : lv1과 크게 다르진 않습니다. lv1의 계산 기능을 Calculator클래스로 옮기고, 해당 클래스에 컬렉션 필드를 선언하여 값을 계산 결과를 컬렉션 필드에 넣고, 넣은 값을 App클래스에서 다시 불러와 사용하는 느낌으로 분리했습니다. 또한 기존 lv1의 경우 계산이 끝나면 exit로 프로그램 종료만 가능했지만, 컬렉션리스트에서 가장 오래 된 값을 삭제하는 remove기능을 만들었습니다. exit를 입력하면 종료하고, remove를 입력하면 삭제가 되게끔 구현했습니다.
  - lv3 : enum이 뭔지 몰라서 알아보고 적용해보는데에 오랜 시간이 걸렸습니다. 일단 어떤 의도로 사용하고, 어떻게 사용할 수 있는가. 정도를 학습하는데에 중점을 두었습니다.
