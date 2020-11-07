package store.sokolov.springboot;

import org.springframework.web.bind.annotation.*;

/** контроллер */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    final private String sharedKey = "SHARED_KEY";

    final private static String SUCCESS_STATUS = "success";
    final private static String ERROR_STATUS = "error";
    final private static int CODE_SUCCESS = 100;
    final private static int AUTH_FAILURE = 102;

    @GetMapping
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }

    @PostMapping
    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
        final BaseResponse response;

        if (sharedKey.equalsIgnoreCase(key)) {
            int userId = request.getUserId();
            String itemId = request.getItemId();
            double discount = request.getDiscount();
            // Process the request
            // ....
            // Return success response to the client.
            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }
}
