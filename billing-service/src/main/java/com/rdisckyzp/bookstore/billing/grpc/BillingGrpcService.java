package com.rdisckyzp.bookstore.billing.grpc;

import com.rdisckyzp.bookstore.billing.BillingRequest;
import com.rdisckyzp.bookstore.billing.BillingResponse;
import com.rdisckyzp.bookstore.billing.BillingServiceGrpc.BillingServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {
    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

    @Override
    public void createBillingAccount(
            BillingRequest billingRequest, StreamObserver<BillingResponse> responseStreamObserver) {
        log.info("createBillingAccount request received: {}", billingRequest.toString());

        // @TODO: Should handle real business logic instead of hard-coding
        // e.g save to database, perform calculates, etc
        // gRPC is good for services that needs speed, reliability, frequent communication, tight contract
        // e.g charge billing, send realtime analytics, handle chat application, etc

        BillingResponse billingResponse = BillingResponse.newBuilder()
                .setAccountId("12345")
                .setStatus("DELIVERED")
                .build();

        responseStreamObserver.onNext(billingResponse);
        responseStreamObserver.onCompleted();
    }
}
