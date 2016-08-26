package com.opitzconsulting.hamcrest.entitymatcher.examples;

import com.opitzconsulting.hamcrest.entitymatcher.Person;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.Matchers.equalTo;

/**
 * @author Stefan Lack
 */
public class ExampleErrorCollector {
  @Rule
  public ErrorCollector errorCollector = new ErrorCollector();

  @Test
  @Ignore( "Ignored, since this demonstration code and is expected to fail!" )
  public void testing_single_properties_with_error_collector() {
    final Person expected = new Person( "Maier", "Hans" ).withAge( 42 );
    final Person actual = new Person( "Mayer", "Hans" ).withAge( 7 );

    errorCollector
      .checkThat( "lastname correct", actual.getLastName(), equalTo( expected.getLastName() ) );
    errorCollector
      .checkThat( "firstname correct", actual.getFirstName(), equalTo( expected.getFirstName() ) );
    errorCollector.checkThat( "age correct", actual.getAge(), equalTo( expected.getAge() ) );
  }
}
