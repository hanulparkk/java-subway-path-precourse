package subway.controller;

public enum SubwayMessage {
    MAIN_SCREEN("## 메인 화면\n"
            + "1. 경로 조회\n"
            + "Q. 종료\n\n"),
    SELECT_FUNCTION("## 원하는 기능을 선택하세요.\n"),
    ERROR_SELECT_FUNCTION("[ERROR] 선택할 수 없는 기능입니다.\n\n");

    private String content;

    SubwayMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
