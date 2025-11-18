CREATE TABLE ExperienceEvents (
    eventID VARCHAR(50),
    timestamp DATETIME,
    person_ID VARCHAR(50),
    eventType VARCHAR(50),
    commerce_order_priceTotal DECIMAL(10, 2),
    _tenantNamespace_loyalty_tier VARCHAR(20)
);
INSERT INTO ExperienceEvents (
        eventID,
        timestamp,
        person_ID,
        eventType,
        commerce_order_priceTotal,
        _tenantNamespace_loyalty_tier
    )
VALUES (
        'E001',
        '2025-11-18 10:00:00',
        'P100',
        'commerce.purchases',
        125.50,
        'Gold'
    ),
    (
        'E002',
        '2025-11-18 10:05:00',
        'P101',
        'web.webpagedetails.pageViews',
        NULL,
        'Silver'
    ),
    (
        'E003',
        '2025-11-18 10:15:00',
        'P100',
        'web.webpagedetails.pageViews',
        NULL,
        'Gold'
    ),
    (
        'E004',
        '2025-11-18 10:30:00',
        'P102',
        'commerce.purchases',
        299.99,
        'None'
    );
SELECT person_ID,
    timestamp,
    eventType
FROM ExperienceEvents
WHERE eventType = 'commerce.purchases'
ORDER BY timestamp;