package com.opitzconsulting.hamcrest.entitymatcher.examples;

import com.opitzconsulting.hamcrest.entitymatcher.Person;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.Assert.assertThat;

/**
 * @author Stefan Lack
 */
public class ExampleHamcrestSamePropertyValuesAs {

  @Test
  @Ignore( "Ignored, since this demonstration code and is expected to fail!" )
  public void testing_single_properties_with_hamcrest_samePropertyValuesAs() {
    final Person expected = new Person( "Maier", "Hans" ).withAge( 42 );
    final Person actual = new Person( "Mayer", "Hans" ).withAge( 7 );

    assertThat( actual, samePropertyValuesAs( expected ) );
  }
}
