 @Test
    public void testSimpleGetResponseFromServerVolley() throws Exception {
        final CountDownLatch signal = new CountDownLatch(1);
 
        NetworkClass.NetworkListener listener = new NetworkClass.NetworkListener() {
            @Override
            public void onResponse(Response response) {
                assertThat(response != null);
                System.out.println("Got Response");
                signal.countDown();
 
            }
 
            @Override
            public void onError(Throwable error) {
                System.out.println("No Response");
                signal.countDown();
            }
        };
        NetworkClass.getResponseFromServer(null, listener);
        signal.await();
    }