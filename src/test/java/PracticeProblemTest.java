import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void pyramidTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("pyramid", cArg);
  // Enter code here
    assertEquals("", (String)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void pyramidTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("pyramid", cArg);
  // Enter code here
    assertEquals("", (String)method.invoke(null, -10));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void pyramidTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("pyramid", cArg);
  // Enter code here
    assertEquals("*", (String)method.invoke(null, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void pyramidTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("pyramid", cArg);
  // Enter code here
    assertEquals("  *\n * *\n* * *", (String)method.invoke(null, 3));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void squareTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("square", cArg);
  // Enter code here
    assertEquals("", (String)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void squareTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("square", cArg);
  // Enter code here
    assertEquals("", (String)method.invoke(null, -5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void squareTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("square", cArg);
  // Enter code here
    assertEquals("*", (String)method.invoke(null, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void squareTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("square", cArg);
  // Enter code here
    assertEquals("****\n*  *\n*  *\n****", (String)method.invoke(null, 4));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void hasLowercaseTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("hasLowercase", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, "HELP Me"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void hasLowercaseTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("hasLowercase", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, "Help Me"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void hasLowercaseTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("hasLowercase", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, "HELP ME"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void hasLowercaseTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("hasLowercase", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, ""));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void hasLowercaseTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("hasLowercase", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, "12345!"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
