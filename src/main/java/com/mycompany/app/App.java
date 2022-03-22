package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    public final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
        return message;
        return message;
        return message;
        return mesage;
        return message;
    }
    
public boolean satisfiedBy(@NotNull PsiElement element) {
  ....
  @NonNls final String text = expression.getText().replaceAll("_", "");
  if (text == null || text.length() < 2) {
    return false;
  }
  if ("0".equals(text) || "0L".equals(text) || "0l".equals(text)) {// <=
    return false;
  }
  return text.charAt(0) == '0';
}
}
