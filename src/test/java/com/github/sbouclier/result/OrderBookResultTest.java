package com.github.sbouclier.result;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.sbouclier.utils.StreamUtils;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 * OrderBookResult test
 *
 * @author Stéphane Bouclier
 */
public class OrderBookResultTest {

    @Test
    public void should_return_to_string() throws IOException {

        // Given
        final String jsonResult = StreamUtils.getResourceAsString(this.getClass(), "json/order_book.mock.json");
        OrderBookResult mockResult = new ObjectMapper().readValue(jsonResult, OrderBookResult.class);

        // When
        final String toString = mockResult.toString();

        // Then
        assertThat(toString, startsWith("OrderBookResult"));
    }
}
