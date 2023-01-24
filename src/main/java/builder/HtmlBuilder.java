package builder;

public class HtmlBuilder implements Builder {
    private String fileName = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("<html>\n<head>\n<title>\n" + title + "\n</title>\n</head>\n<body>\n");
        sb.append("<h1>" + title + "</h1>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>" + str + "</p>\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>\n");
        for (String item : items) {
            sb.append("<li>" + item + "</li>\n");
        }
        sb.append("</ul>\n");
    }

    @Override
    public void close() {
        sb.append("</body>\n</html>\n");
    }

    public String getHtmlResult() {
        return fileName;
    }
}
