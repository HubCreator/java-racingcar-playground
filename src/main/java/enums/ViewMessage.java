package enums;

public enum ViewMessage {
    INPUT_RACING_CAR_NAME_MESSAGE(String.format("경주할 자동차 이름을 입력하세요(이름은 쉼표(%s)를 기준으로 구분).", Delimiter.COMMA.getValue())),
    INPUT_TRY_COUNT_MESSAGE("시도할 회수는 몇회인가요?"),
    RESULT_MESSAGE("실행 결과"),
    RESULT_WHOS_WIN("{0}가 최종 우숭했습니다.");


    private final String value;

    ViewMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
