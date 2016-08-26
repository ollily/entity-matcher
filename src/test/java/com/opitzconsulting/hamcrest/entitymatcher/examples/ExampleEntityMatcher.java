package com.opitzconsulting.hamcrest.entitymatcher.examples;

import com.opitzconsulting.hamcrest.entitymatcher.Person;
import org.junit.Test;

import static com.opitzconsulting.hamcrest.entitymatcher.EntityMatcher.matchesAllProperties;
import static org.junit.Assert.assertThat;

/**
 * @author Stefan Lack
 */
public class ExampleEntityMatcher {

  @Test
  public void testing_single_properties_with_matchesAllProperties() {
    final Person expected = new Person( "Maier", "Hans" ).withAge( 42 );
    final Person actual = new Person( "Mayer", "Hans" ).withAge( 7 );

    assertThat( actual, matchesAllProperties( expected ) );
  }
}
