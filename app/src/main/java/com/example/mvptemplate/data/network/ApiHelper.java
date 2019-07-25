package com.example.mvptemplate.data.network;

import com.example.mvptemplate.data.network.model.LoginRequest;
import com.example.mvptemplate.data.network.model.LoginResponse;
import com.example.mvptemplate.data.network.model.RegisterRequest;
import com.example.mvptemplate.data.network.model.RegisterResponse;
import com.example.mvptemplate.data.network.model.ValidateCodeRequest;
import com.example.mvptemplate.data.network.model.ValidateCodeResponse;

public interface ApiHelper {

    ApiHeader getApiHeader();

    LoginResponse doLoginApiCall(LoginRequest.ServerLoginRequest request);

    RegisterResponse doRegisterApiCall(RegisterRequest request);

    ValidateCodeResponse doSendValidateCodeApiCall(ValidateCodeRequest request);

}
