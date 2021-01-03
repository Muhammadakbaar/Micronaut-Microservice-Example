package example.micronaut.bookrecommendation;

import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;
import io.micronaut.retry.annotation.Recoverable;
import javax.validation.constraints.NotBlank;

@Client(id = "bookinventory") 
@Recoverable(api = BookInventoryOperations.class)
interface BookInventoryClient extends BookInventoryOperations {

    @Consumes(MediaType.TEXT_PLAIN)
    @Get("/books/stock/{isbn}")
    Maybe<Boolean> stock(@NonNull @NotBlank String isbn);
}
