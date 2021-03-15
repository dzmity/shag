package by.shag.lesson21;

import java.io.IOException;

public class FormHandler {

    private FormDB formDB;


    public void handle(Form form) throws IOException {
        if (form isOk) {
            formDB.save(form);
        } else {
            throw IOException("not ok");
        }
    }

    public void handleWithTrimWhitespaces(Form form) {
        String year = form.getYear().trim();
        if (form isOk) {
            formDB.save(form);
        } else {
            throw new RuntimeException("введите число");
        }
    }
}
