# SOPT_1
SOPT android part 1차 세미나 과제

## ScreenShots
<div>
<img width="250" src="https://user-images.githubusercontent.com/50590192/79749678-9642cc00-834a-11ea-84dd-426d07b7e1c1.png">
<img width="250" src="https://user-images.githubusercontent.com/50590192/79749714-a3f85180-834a-11ea-8121-13ad31b23f51.png">
<img width="250" src="https://user-images.githubusercontent.com/50590192/79749755-b5d9f480-834a-11ea-9f01-a31f1617df85.png">
</div>

## Learned Points
* ConstraintLayout에서 ConstraintDimentionRatio를 이용해서 ImageView를 1:1로 설정할 수 있음
* Guideline을 이용해서 TextView의 크기를 정할 수 있음
* 회원가입 시 작성한 정보 유지
  - LoginActivity에서 JoinActivity로 넘어갈 때 startActivityForResult(intent, requestCode)
  - JoinActivity에서 새로운 intent에 넘겨줄 정보를 넣은 후 setResult(Activity.RESULT_OK, intent)
  - LoginActivity에서 onActivityResult로 정보 받음
* 로그인 유지
  - SharedPreferences를 사용하는 class를 따로 구현하면 전역으로 설정할 수 있음
  - LoginActivity의 onCreate에서 sharedPreference를 초기화 해주고 로그인 성공 시 값을 넣어 줌
  - LoginActivity의 onStart에서 sharedPreference의 값을 확인하고 값이 일치하면 MainActivity를 호출함
