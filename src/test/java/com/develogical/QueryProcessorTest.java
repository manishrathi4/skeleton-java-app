package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void knowsWhoWroteRomeoAndJuliet() throws Exception {
    assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("Shakespeare"));
  }

  @Test
  public void isNotCaseSensitive() throws Exception {
    assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("Shakespeare"));
  }

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsWhatIsSumOfNumbers() throws Exception {
    assertThat(queryProcessor.process("ae663ea0:what is 18 plus 2"), containsString("20"));
  }

  @Test
  public void findLargestNumber() throws Exception {
    assertThat(queryProcessor.process("ae663ea0:which of the following numbers is the largest: 171, 238, 99, 83"), containsString("238"));
  }
}
