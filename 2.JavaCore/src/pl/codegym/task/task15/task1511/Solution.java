package pl.codegym.task.task15.task1511;

import java.io.Serializable;

/* 
Najprostszy kod: część 1
*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("Co sądzisz o com.codegym.task.task15.task1511?"));
        System.out.println(me.askZapp("Kiedy pojawi się następna aktualizacja?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev /*extends Object*/ implements SpecificSerializable {
        String answerQuestion(String question) {

            return String.format("Zastanowię się nad [%s]", question);
        }
    }

    public static class JuniorJavaDev extends /*Object,*/ JavaDev/* implements SpecificSerializable*/ {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {

            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {

            return hubert.answerQuestion(question);
        }
    }
}
