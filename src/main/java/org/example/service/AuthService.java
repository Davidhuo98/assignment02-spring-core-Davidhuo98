package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    /**
     * 认证方法，用于验证传入的 token 是否有效。
     *
     * @param token 需要验证的令牌字符串，通常由客户端提供。
     *              该参数不能为空，且应符合预期的格式。
     * @return 如果传入的 token 等于 "valid_token"，返回 true，表示认证成功；
     *         否则返回 false，表示认证失败。
     */
    public boolean authenticate(String token) {
        // 简单认证逻辑：检查 token 是否等于预定义的有效值 "valid_token"
        return "valid_token".equals(token);
    }
}

