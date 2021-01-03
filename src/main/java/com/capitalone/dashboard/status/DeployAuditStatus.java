package com.capitalone.dashboard.status;

public enum DeployAuditStatus {
    DEPLOY_SCRIPTS_FOUND_TESTED,
    DEPLOY_SCRIPTS_FOUND_NOT_TESTED,
    DEPLOYMENT_SCRIPTS_TEST_NOT_FOUND,
    DASHBOARD_DEPLOYMENT_SCRIPTS_NOT_CONFIGURED,
    NO_ACTIVITY,
    COLLECTOR_ITEM_ERROR,
    UNAVAILABLE;
}
