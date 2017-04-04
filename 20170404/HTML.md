# HTML(Hyper Text Markup Language)
text : 문자열
jsp => html + java + jsp 스크립트
Markup Language
Markup : 표식

ex) _나는 어제 사과를 10개를 먹었다. (사람은 알수 있다, 하지만 컴퓨터는 알 수가 없다.)_
```
<누가>    나          </누가>
<언제>    어제        </언제>
<무엇을>  사과를      </무엇을>
<몇개>    10개        </몇개>
<한것>    먹었다.      </한것>
```
_컴퓨터가 알 수 있는 언어로 표식을 하였다._
`<>`택스트`</>`
`<>` : 태그열기
`</>` : 태크 닫기
## element
: 실제 표현할 아이템들

* 자식들태그들
* 결과적으로 태그들을 모두 앨리먼트라고 한다.
```
<form>
    <input></input>
</form>
```
`<form>` : 앨리먼트
`<input>` : 앨리먼트

## attribute
: 태그가 가지고 있는 속성 값을 지정해 줄 수 있다.  
ex) _<사과>10</사과>_
사과에 색을 입히고 싶다. 그럴때,
```
<사과 색상 = "빨강">
```
`색상` : 어트리뷰트
* form 태그
`action` 은 request할 주소 나타낸다.
`mrthod` 는 전송 방식(get/post)
* input 태그
`id` 는 유일한 갑인게 좋다.
`name` 은 파라미터의 키값(_key-value_ 형식)
* label 태그
`for`

# DOM(Document Object Mode)
```
<html>
    <head>
        <title>Insert title here</title>
    </head>
    <body>

    </body>
</html>
```
_HTML구조를 DOM이라고 한다._
동일 선상에 존재하게 되면 형재(p/div/form)
부모 아래에 있으면 자식(html : head/body , form : input/checkbox/submit)
