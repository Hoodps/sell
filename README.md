# sell
weixin sell

# IDEA 快捷建

+ Alt+Enter  导入包
+ Alt+Insert  get set
+ Shift+Enter  光标下一行


# 报错

### Table 'spring.hibernate_sequence' doesn't exist
将id的生成策略设置成@GeneratedValue(strategy = GenerationType.IDENTITY)

### 报错 Inferred type 'S' for type parameter 'S' is not within its bound; 解决办法
出现这种问题的原因是，springboot 版本问题，将 2。1 版本换成 1。5。4 版本。
或者是将代码改写一下 return girlRepository.findOne(id); return girlRepository.findById(id).orElse(null);

